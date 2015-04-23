
  package gen;
  public class S_Gen199 {
  		@com.google.inject.Inject
  		public S_Gen199(S_Gen200 s_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  