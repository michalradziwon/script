
  package gen;
  public class F_Gen87 {
  		@com.google.inject.Inject
  		public F_Gen87(F_Gen88 f_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  