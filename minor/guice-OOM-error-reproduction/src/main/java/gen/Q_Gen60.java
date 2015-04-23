
  package gen;
  public class Q_Gen60 {
  		@com.google.inject.Inject
  		public Q_Gen60(Q_Gen61 q_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  