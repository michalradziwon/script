
  package gen;
  public class F_Gen63 {
  		@com.google.inject.Inject
  		public F_Gen63(F_Gen64 f_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  