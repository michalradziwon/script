
  package gen;
  public class F_Gen100 {
  		@com.google.inject.Inject
  		public F_Gen100(F_Gen101 f_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  