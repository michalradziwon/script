
  package gen;
  public class O_Gen38 {
  		@com.google.inject.Inject
  		public O_Gen38(O_Gen39 o_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  