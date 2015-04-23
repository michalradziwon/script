
  package gen;
  public class S_Gen173 {
  		@com.google.inject.Inject
  		public S_Gen173(S_Gen174 s_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  