
  package gen;
  public class H_Gen8 {
  		@com.google.inject.Inject
  		public H_Gen8(H_Gen9 h_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  