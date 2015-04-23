
  package gen;
  public class Z_Gen13 {
  		@com.google.inject.Inject
  		public Z_Gen13(Z_Gen14 z_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  