
  package gen;
  public class S_Gen79 {
  		@com.google.inject.Inject
  		public S_Gen79(S_Gen80 s_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  