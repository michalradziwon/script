
  package gen;
  public class S_Gen72 {
  		@com.google.inject.Inject
  		public S_Gen72(S_Gen73 s_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  