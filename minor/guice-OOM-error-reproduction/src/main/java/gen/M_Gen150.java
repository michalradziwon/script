
  package gen;
  public class M_Gen150 {
  		@com.google.inject.Inject
  		public M_Gen150(M_Gen151 m_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  