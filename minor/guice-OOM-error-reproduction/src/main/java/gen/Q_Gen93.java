
  package gen;
  public class Q_Gen93 {
  		@com.google.inject.Inject
  		public Q_Gen93(Q_Gen94 q_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  