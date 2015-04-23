
  package gen;
  public class S_Gen44 {
  		@com.google.inject.Inject
  		public S_Gen44(S_Gen45 s_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  