
  package gen;
  public class S_Gen180 {
  		@com.google.inject.Inject
  		public S_Gen180(S_Gen181 s_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  