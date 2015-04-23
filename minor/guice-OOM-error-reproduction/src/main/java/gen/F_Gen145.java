
  package gen;
  public class F_Gen145 {
  		@com.google.inject.Inject
  		public F_Gen145(F_Gen146 f_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  