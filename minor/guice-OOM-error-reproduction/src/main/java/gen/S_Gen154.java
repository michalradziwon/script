
  package gen;
  public class S_Gen154 {
  		@com.google.inject.Inject
  		public S_Gen154(S_Gen155 s_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  