
  package gen;
  public class S_Gen101 {
  		@com.google.inject.Inject
  		public S_Gen101(S_Gen102 s_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  