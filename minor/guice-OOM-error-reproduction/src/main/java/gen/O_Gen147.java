
  package gen;
  public class O_Gen147 {
  		@com.google.inject.Inject
  		public O_Gen147(O_Gen148 o_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  