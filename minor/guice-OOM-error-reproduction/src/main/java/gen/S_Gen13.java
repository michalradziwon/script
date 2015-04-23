
  package gen;
  public class S_Gen13 {
  		@com.google.inject.Inject
  		public S_Gen13(S_Gen14 s_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  