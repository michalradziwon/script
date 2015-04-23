
  package gen;
  public class S_Gen19 {
  		@com.google.inject.Inject
  		public S_Gen19(S_Gen20 s_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  