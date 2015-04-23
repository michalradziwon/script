
  package gen;
  public class Q_Gen12 {
  		@com.google.inject.Inject
  		public Q_Gen12(Q_Gen13 q_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  