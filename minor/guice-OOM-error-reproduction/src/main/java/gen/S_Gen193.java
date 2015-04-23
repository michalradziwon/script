
  package gen;
  public class S_Gen193 {
  		@com.google.inject.Inject
  		public S_Gen193(S_Gen194 s_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  