
  package gen;
  public class S_Gen147 {
  		@com.google.inject.Inject
  		public S_Gen147(S_Gen148 s_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  