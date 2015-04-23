
  package gen;
  public class S_Gen149 {
  		@com.google.inject.Inject
  		public S_Gen149(S_Gen150 s_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  