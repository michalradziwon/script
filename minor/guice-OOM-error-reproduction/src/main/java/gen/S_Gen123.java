
  package gen;
  public class S_Gen123 {
  		@com.google.inject.Inject
  		public S_Gen123(S_Gen124 s_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  