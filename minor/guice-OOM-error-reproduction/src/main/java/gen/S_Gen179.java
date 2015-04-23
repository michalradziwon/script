
  package gen;
  public class S_Gen179 {
  		@com.google.inject.Inject
  		public S_Gen179(S_Gen180 s_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  