
  package gen;
  public class S_Gen94 {
  		@com.google.inject.Inject
  		public S_Gen94(S_Gen95 s_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  