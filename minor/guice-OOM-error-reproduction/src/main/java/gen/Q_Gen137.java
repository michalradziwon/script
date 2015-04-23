
  package gen;
  public class Q_Gen137 {
  		@com.google.inject.Inject
  		public Q_Gen137(Q_Gen138 q_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  