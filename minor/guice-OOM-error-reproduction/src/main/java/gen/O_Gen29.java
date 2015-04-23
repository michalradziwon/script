
  package gen;
  public class O_Gen29 {
  		@com.google.inject.Inject
  		public O_Gen29(O_Gen30 o_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  