
  package gen;
  public class S_Gen146 {
  		@com.google.inject.Inject
  		public S_Gen146(S_Gen147 s_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  