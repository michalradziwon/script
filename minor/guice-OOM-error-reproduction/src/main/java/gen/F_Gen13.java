
  package gen;
  public class F_Gen13 {
  		@com.google.inject.Inject
  		public F_Gen13(F_Gen14 f_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  