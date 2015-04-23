
  package gen;
  public class Q_Gen124 {
  		@com.google.inject.Inject
  		public Q_Gen124(Q_Gen125 q_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  