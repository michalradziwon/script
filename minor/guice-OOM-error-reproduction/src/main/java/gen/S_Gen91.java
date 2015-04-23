
  package gen;
  public class S_Gen91 {
  		@com.google.inject.Inject
  		public S_Gen91(S_Gen92 s_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  