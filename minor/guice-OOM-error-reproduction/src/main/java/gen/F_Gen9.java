
  package gen;
  public class F_Gen9 {
  		@com.google.inject.Inject
  		public F_Gen9(F_Gen10 f_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  