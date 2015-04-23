
  package gen;
  public class S_Gen175 {
  		@com.google.inject.Inject
  		public S_Gen175(S_Gen176 s_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  