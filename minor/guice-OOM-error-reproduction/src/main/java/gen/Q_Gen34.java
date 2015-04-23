
  package gen;
  public class Q_Gen34 {
  		@com.google.inject.Inject
  		public Q_Gen34(Q_Gen35 q_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  