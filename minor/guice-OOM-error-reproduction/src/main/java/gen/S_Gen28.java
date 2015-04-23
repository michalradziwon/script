
  package gen;
  public class S_Gen28 {
  		@com.google.inject.Inject
  		public S_Gen28(S_Gen29 s_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  