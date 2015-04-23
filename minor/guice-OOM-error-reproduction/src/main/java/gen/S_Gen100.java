
  package gen;
  public class S_Gen100 {
  		@com.google.inject.Inject
  		public S_Gen100(S_Gen101 s_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  