
  package gen;
  public class S_Gen49 {
  		@com.google.inject.Inject
  		public S_Gen49(S_Gen50 s_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  