
  package gen;
  public class S_Gen8 {
  		@com.google.inject.Inject
  		public S_Gen8(S_Gen9 s_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  