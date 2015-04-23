
  package gen;
  public class Q_Gen85 {
  		@com.google.inject.Inject
  		public Q_Gen85(Q_Gen86 q_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  