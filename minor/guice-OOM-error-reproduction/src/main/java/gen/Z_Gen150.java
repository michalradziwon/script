
  package gen;
  public class Z_Gen150 {
  		@com.google.inject.Inject
  		public Z_Gen150(Z_Gen151 z_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  