
  package gen;
  public class O_Gen8 {
  		@com.google.inject.Inject
  		public O_Gen8(O_Gen9 o_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  