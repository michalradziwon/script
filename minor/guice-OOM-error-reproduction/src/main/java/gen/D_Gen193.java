
  package gen;
  public class D_Gen193 {
  		@com.google.inject.Inject
  		public D_Gen193(D_Gen194 d_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  