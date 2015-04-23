
  package gen;
  public class S_Gen102 {
  		@com.google.inject.Inject
  		public S_Gen102(S_Gen103 s_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  