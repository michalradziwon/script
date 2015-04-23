
  package gen;
  public class S_Gen81 {
  		@com.google.inject.Inject
  		public S_Gen81(S_Gen82 s_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  