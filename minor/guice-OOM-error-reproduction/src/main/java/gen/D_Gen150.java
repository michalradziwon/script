
  package gen;
  public class D_Gen150 {
  		@com.google.inject.Inject
  		public D_Gen150(D_Gen151 d_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  