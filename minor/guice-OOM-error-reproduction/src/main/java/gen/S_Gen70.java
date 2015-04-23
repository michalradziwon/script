
  package gen;
  public class S_Gen70 {
  		@com.google.inject.Inject
  		public S_Gen70(S_Gen71 s_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  