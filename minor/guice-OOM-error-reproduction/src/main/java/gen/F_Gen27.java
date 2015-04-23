
  package gen;
  public class F_Gen27 {
  		@com.google.inject.Inject
  		public F_Gen27(F_Gen28 f_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  