
  package gen;
  public class F_Gen149 {
  		@com.google.inject.Inject
  		public F_Gen149(F_Gen150 f_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  