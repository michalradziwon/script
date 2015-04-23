
  package gen;
  public class F_Gen150 {
  		@com.google.inject.Inject
  		public F_Gen150(F_Gen151 f_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  