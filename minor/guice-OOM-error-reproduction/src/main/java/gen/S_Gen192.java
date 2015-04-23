
  package gen;
  public class S_Gen192 {
  		@com.google.inject.Inject
  		public S_Gen192(S_Gen193 s_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  