
  package gen;
  public class F_Gen138 {
  		@com.google.inject.Inject
  		public F_Gen138(F_Gen139 f_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  