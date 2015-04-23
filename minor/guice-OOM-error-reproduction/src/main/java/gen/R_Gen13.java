
  package gen;
  public class R_Gen13 {
  		@com.google.inject.Inject
  		public R_Gen13(R_Gen14 r_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  